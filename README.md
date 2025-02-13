# Quarkus Config Disambiguation Reproducer



1. Build with valid config on Quarkus 3.16.4: https://gradle.com/s/r3l2mxnpzxftm
2. After an upgrade we get a failure to start a server with these properties defined: https://scans.gradle.com/s/o3umrmnciguty/tests/task/:lib:test/details/com.ryandens.ConfigResolutionTest/name()?top-execution=1 