package by.jonline.module4.prost.task08.customer;

public class Customer {

    private int id;
    private String firstName;
    private String secondName;
    private String fatherName;
    private String adress;
    private long cardNo;
    private long bankAcNo;

    public Customer(int id, String secondName, String firstName, String fatherName, String adress, long cardNo, long bankAcNo) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.adress = adress;
        this.cardNo = cardNo;
        this.bankAcNo = bankAcNo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getSecondName() { return secondName; }
    public void setSecondName(String secondName) { this.secondName = secondName; }
    public String getFatherName() { return fatherName; }
    public void setFatherName(String fatherName) { this.fatherName = fatherName; }
    public String getAdress() { return adress; }
    public void setAdress(String adress) { this.adress = adress; }
    public long getCardNo() { return cardNo; }
    public void setCardNo(long cardNo) { this.cardNo = cardNo; }
    public long getBankAcNo() { return bankAcNo; }
    public void setBankAcNo(long bankAcNo) { this.bankAcNo = bankAcNo; }

    @Override
    public String toString() {
        return "Customer " +
                "id= " + id +
                "; Имя: " + secondName +
                " " + firstName +
                " " + fatherName +
                "; Адрес: " + adress +
                "; cardNo: " + cardNo +
                "; bankAcNo: " + bankAcNo +
                '}';
    }


}
