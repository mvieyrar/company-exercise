package principles.abstraction.company.proposal;

public abstract class Company
{
    private String name;

    public Company(String name)
    {
        this.name = name;
    }
    
    public abstract String createProduct(String productName);

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
