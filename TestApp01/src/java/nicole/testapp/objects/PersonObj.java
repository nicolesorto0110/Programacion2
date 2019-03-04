package nicole.testapp.objects;

public class PersonObj {
    
    private String m_strName;
    private String m_strLastName;
    private int m_iAge;
    private String m_strCharge;
    private double m_dSalary;

    public PersonObj(String p_strName, String p_strLastName, int p_iAge, String p_strCharge, double p_dSalary) {
        setName(p_strName);
        setLastName(p_strLastName);
        setAge(p_iAge);
        setCharge(p_strCharge);
        setSalary(p_dSalary);
    }
    

    public String getName() {
        return m_strName;
    }

    private void setName(String p_strName) {
        m_strName = p_strName;
    }

    public String getLastName() {
        return m_strLastName;
    }

    private void setLastName(String p_strLastName) {
        m_strLastName = p_strLastName;
    }

    public int getAge() {
        return m_iAge;
    }

    private void setAge(int p_iAge) {
        m_iAge = p_iAge;
    }

    public String getCharge() {
        return m_strCharge;
    }

    private void setCharge(String p_strCharge) {
        m_strCharge = p_strCharge;
    }

    public double getSalary() {
        return m_dSalary;
    }

    private void setSalary(double p_dSalary) {
        m_dSalary = p_dSalary;
    }
    
    public double getYearSalary(){
        double dSalary = getSalary();
        double dYearSalary = dSalary * 12;
        return dYearSalary;
    }
    
    
}
