package com.prog;

import java.lang.reflect.Constructor;

public class TypesOfObjectCreation implements Cloneable {

    // to have clone method to return the object by using super keyword
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Object creation :");
    }

    public static void main(String[] args) {
        // Type 1
        TypesOfObjectCreation objCreation = new TypesOfObjectCreation();

        /*
             Type 2
             It throws IllegalAccessException if the class or its nullary constructor is not accessible.
             It also throws InstantiationException, if the Class represents an abstract class,
             an interface, an array class, or a primitive type.
         */


        try {
            TypesOfObjectCreation newInstanceObj = TypesOfObjectCreation.class.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException ie) {
            ie.printStackTrace();
        }

        /*
            Type 3
            calling the newInstance() method via contructor
            internally, it call the newInstance() method when creating object via constructor
         */

        try {
            Constructor<TypesOfObjectCreation> obj = TypesOfObjectCreation.class.getConstructor();
            TypesOfObjectCreation constructorObj = obj.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
            Type 4
            Cloning object, for this need to implement the cloneable interface
            and to have a clone() method to return the object by super keyword eg. super.clone
         */

        //creating object of class
        TypesOfObjectCreation obj = new TypesOfObjectCreation();
        try {
            TypesOfObjectCreation cloneObj = (TypesOfObjectCreation) obj.clone();
            //cloneObj.display();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
