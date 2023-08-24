package dataStructures;

import javaBasics.BankAccount;

import java.util.Arrays;

public class ArrayExample {
    public static void createIntArray() {
        int[] arr; // declare the array arr
        arr = new int[3]; // allocate memory
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 1;

//        initialize a list
//        int[] arr = {5,3,1};
//        Cant use print - it would print memory
        System.out.println(Arrays.toString(arr));
//        To print arrays list
//        memory fixed
//        array stores the address of the object

        // Iterate using indices

//        from Collections you can use better list
//        If <> not added then any element - not recommended
//        Tree set keeps ir sorted
//        Lower - smalledt that the element
//        Treeset with object of multiple keys then implement comparor
//        Sort call the compare to method of collection method and will use the compare to method we used

//        Hash code needs to be changed for sorting also for own own object.
//        They done accept primitive - like int , double and others - primitive should be converted to other int becomes Integer
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        // Iterate using a for each loop
       /* for (int elem: arr)
            System.out.println(elem);

        */
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

         */
    }

    public static void createBankAccountArray() {
        BankAccount[] accounts = {new BankAccount(300, "Smith"), new BankAccount(250, "Jones")};

        for (BankAccount account: accounts) {
            System.out.println(account);
        }

    }

    public static void main(String[] args) {
       createIntArray();
       //createBankAccountArray();
    }
}
