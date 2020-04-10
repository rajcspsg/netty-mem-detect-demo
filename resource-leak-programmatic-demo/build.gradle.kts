dependencies {
    implementation(project(":core"))
}

task("runMain", JavaExec::class) {
    main = "com.myorg.netty.Main"
    classpath = sourceSets["main"].runtimeClasspath
}