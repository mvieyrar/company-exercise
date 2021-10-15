package principles.abstraction.company.proposal;

public class Designer implements Employee
{
    @Override
	public String doWork(String systemName) {
		return "Here's the architecture for: " + systemName + "\n";
	}
}
