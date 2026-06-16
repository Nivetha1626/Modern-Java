static class College implements AutoCloseable {
    College(){
        System.out.println("College");
    }

    @Override
    public void close() throws Exception {
        System.out.println("college Close");
    }
}

static class Department extends College {
    Department(){
        System.out.println("Department");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Department Close");
        super.close();
    }
}

static class Year extends Department{
    Year(){
        System.out.println("Year");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Year Close");
        super.close();
    }
}

static void main() throws Exception {
    try(Year secondYear= new Year())
    {

    }
}

