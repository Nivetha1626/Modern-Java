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

static class SecondYear extends Department{
    SecondYear(){
        System.out.println("SecondYear");
    }

    @Override
    public void close() throws Exception {
        System.out.println("SecondYear Close");
        super.close();
    }
}

static void main() throws Exception {
    try(SecondYear secondYear= new SecondYear())
    {

    }
}

