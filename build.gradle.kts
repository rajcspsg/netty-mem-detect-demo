allprojects {
    group = "org.example"
    version = "1.0-SNAPSHOT"
}
subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
        mavenLocal()
        jcenter()
        google()
    }

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    dependencies {
        val implementation by configurations
        implementation("io.netty", "netty-all", "4.1.48.Final")
        implementation("org.slf4j", "slf4j-api", "1.7.25")
        implementation("org.apache.commons", "commons-lang3", "3.7")
    }
}