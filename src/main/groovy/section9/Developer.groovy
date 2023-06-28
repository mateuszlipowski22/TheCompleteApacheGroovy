package section9

class Developer {

    String first;
    String last;
    String email;
    List language;

    Developer(){}

    @Override
    Object invokeMethod(String name, Object args) {
        println "invokeMethod() called with args $args";
    }

    @Override
    Object getProperty(String propertyName) {
        println "getProperty() called";
        metaClass.getProperty(this, propertyName);
    }

    @Override
    void setProperty(String propertyName, Object newValue) {
        println "setProperty() called with name $propertyName and new value $newValue";
        metaClass.setProperty(this, propertyName, newValue);
    }
}
