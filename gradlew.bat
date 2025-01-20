plugins {
    id 'java'
    id 'application'
}

group = 'com.example'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'info.picocli:picocli:4.7.3'
}

application {
    mainClass = 'com.example.cli.CompanyNameCLI'
}