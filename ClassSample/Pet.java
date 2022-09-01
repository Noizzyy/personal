public class Pet {

    // Items Attributes

    String Properties;
    String name;
    int trustlevel;
    int level;
    Boolean ishappy;

   



    // Items Method

    public void petDescription() {

        System.out.println("\n Properties: " + Properties + "\nName:"+ name + "Trustlevel: " + trustlevel + "Petlevel" + level + "IsHappy" + ishappy);

    }



    // Constructor

    public Pet(String petpropertie, String petName, int pettrustlevel, int petlevel, Boolean pethappy) {

        Properties = petpropertie;
        name = petName;
        trustlevel = pettrustlevel;
        level = petlevel;
        ishappy =pethappy;




   

    }

}
