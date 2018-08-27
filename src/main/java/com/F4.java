package com;

public class F4 {

    private Integer value = 0;

    {
        new F5();
        new F5();
        new F5();
    }

    private class F5 {
        {
            System.out.println(F4.this.value);
            F4.this.value++;
        }
    }

    public static void main(String[] args) {
        new F4();
    }
}
