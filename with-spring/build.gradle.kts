dependencies {
    implementation(project(":core"))
    implementation("org.springframework.boot:spring-boot-starter:2.2.6.RELEASE")
    implementation( "org.springframework:spring-context:5.2.5.RELEASE")
    implementation("org.springframework:spring-tx:5.2.5.RELEASE")
}

task("runMain", JavaExec::class) {
    main = "com.myorg.netty.Main"
    classpath = sourceSets["main"].runtimeClasspath
    jvmArgs = mutableListOf("-Dio.netty.leakDetection.level=PARANOID")
}