module com.hirbod.practice {
    requires java.base;

    //export all the packages in the module-info so other modules can access them
    //to create a module-info, right click on java file, and make one
    exports com.hirbod.practice;
    exports com.hirbod.utils;
    exports com.hirbod.TestingProducts;
}