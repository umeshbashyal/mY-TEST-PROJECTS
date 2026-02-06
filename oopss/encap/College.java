
// Create a class College with:

// private collegeName

// Rules:

// collegeName should be set only using constructor

// No setter for collegeName

// Only getter allowed

// Task:

// Print college name from main
 class College {

    private String collegename;

    College(String collegename){
        this.collegename= collegename;

    }

    public String getcollegename(){
        return collegename;
    }
    
}
