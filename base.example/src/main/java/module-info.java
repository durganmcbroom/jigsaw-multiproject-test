module base.example {
    requires kotlin.stdlib;
    exports org.example.base;
    requires transitive api.example;
}