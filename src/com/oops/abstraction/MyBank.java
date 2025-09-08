package com.oops.abstraction;

interface MyBank {

    void write();
    void read();
    //declares only

}


class SBI implements MyBank {

    @Override
    public void write() {
        System.out.println("SBI write entire the data");
    }

    @Override
    public void read() {
        System.out.println("SBI read entire the data");
    }
}