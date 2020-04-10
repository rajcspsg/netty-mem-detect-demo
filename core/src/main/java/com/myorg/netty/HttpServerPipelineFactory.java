package com.myorg.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.*;
import io.netty.handler.flow.FlowControlHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

public class HttpServerPipelineFactory extends ChannelInitializer<Channel> {

    @Override
    protected void initChannel(Channel ch) {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast("codec", new HttpServerCodec());
        pipeline.addLast("http-compressor", new HttpContentCompressor());
        pipeline.addLast("http-decompressor", new HttpContentDecompressor());
        pipeline.addLast("aggregator", new HttpObjectAggregator( 512 * 1024));
        ch.pipeline().addLast("http-chunked", new ChunkedWriteHandler());
        pipeline.addLast("http-flowcontroller", new FlowControlHandler());
        pipeline.addLast("keepAlive", new HttpServerKeepAliveHandler());
        pipeline.addLast("request", new AdvancedHTTPHandler());
    }


}
