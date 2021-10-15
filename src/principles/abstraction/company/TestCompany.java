package principles.abstraction.company.proposal;

public class TestCompany
{
    public static void main(String[] args) {
        Company company = new SoftwareCompany("A tu medida");
        System.out.println(company.createProduct("Nomina"));
    }
}
