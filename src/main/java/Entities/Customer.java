package Entities;

public class Customer {
    private String ID;
    private String Name;
    private String Surname;
    private String DateofBirth;
    private String Gender;
    private String Country;
    private String Region;
    private String City;
    private String Phone;
    private String Email;
    private String Occupancy;
    private String Agegroup;
    private double money;
    public Customer(){

    }
    public Customer(String id,String name,String sn, String DOB, String G,String C,String r,String city,String phone , String email,String occupancy,String agegroup,double money ){
        setID(id);
        setName(name);
        setSurname(sn);
        setDateofBirth(DOB);
        setGender(G);
        setCountry(C);
        setRegion(r);
        setCity(city);
        setPhone(phone);
        setEmail(email);
        setOccupancy(occupancy);
        setAgegroup(agegroup);
        setMoney(money);
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.DateofBirth = dateofBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
       this.Country = country;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        this.Region = region;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getOccupancy() {
        return Occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.Occupancy = occupancy;
    }

    public String getAgegroup() {
        return Agegroup;
    }

    public void setAgegroup(String agegroup) {
        this.Agegroup = agegroup;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    @Override
    public String toString() {
        return "Customer{ID="+getID()
                + ", FirstName='" + getName() + '\''
                + ", SecondName='" + getSurname()+'\''
                + ", Date of Birth=" + getDateofBirth()
                + ", Gender="+getGender()+", Country="+getCountry()+", Region="+getRegion()+", City "+getCity()+", Phone"+getPhone()+", Email"+getEmail()+", Occupancy"+getOccupancy()+", Age"+getAgegroup()+", Money"+getMoney()+'}';
    }
}
