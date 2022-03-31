package com.company;

public class Person {
    String name, surname, dni;
    float height, width;

    //public Person(String name, String surname){
      //  this.setName(name);
        //this.setSurname(surname);
    //}

    //public Person(String name){
        //this(name, null);
    //}

    public String getName(){ //Retorna el valor de l'atribut name
        return this.name;
    }

    public void setName(String name){ //Assigna el valor de l'argument a l'atribut name
        this.name = name;
    }

    public float getHeight(){ //Retorna el valor de l'atribut height
        return this.height;
    }

    public void setHeight(float height){ //Assigna el valor de l'argument a l'atribut height
        this.height = height;
    }

    public float getWidth(){ //Retorna el valor de l'atribut width
        return this.width;
    }

    public void setWidth(float width){ //Assigna el valor de l'argument a l'atribut width
        this.width = width;
    }

    public String getSurname(){ //Retorna el valor de l'atribut surname
        return this.surname;
    }

    public void setSurname(String surname){ //Assigna el valor de l'argument a l'atribut surname
        this.surname = surname;
    }

    public String getDni(){ //Retorna el valor de l'atribut dni
        return this.dni;
    }

    public void setDni(String dni){ //Assigna el valor de l'argument a l'atribut dni
        this.dni = dni;
    }
}
