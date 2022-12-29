package com.voter_api_master.voters_initialization.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "voters_table",catalog = "voters_db")
public class VotersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Voters_NIC;
    private String VotersName;
    private Date DateOfBirth;
    private String Address;
    private String City;
    private String State;
    private Date RegisterDate = new Date();
    public VotersModel(){
        super();
    }

    public VotersModel(long Voters_NIC, String VotersName, Date DateOfBirth, String Address,
                       String City,String State, Date RegisterDate) {
        this.Voters_NIC = Voters_NIC;
        this.VotersName = VotersName;
        this.DateOfBirth = DateOfBirth;
        this.Address = Address;
        this.City=City;
        this.State = State;
        this.RegisterDate = RegisterDate;
    }

    public long getVoters_NIC() {
        return Voters_NIC;
    }

    public void setVoters_NIC(long Voters_NIC) {
        this.Voters_NIC = Voters_NIC;
    }

    public String getVotersName() {
        return VotersName;
    }

    public void setVotersName(String VotersName) {
        this.VotersName = VotersName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public Date getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(Date RegisterDate) {
        this.RegisterDate = RegisterDate;
    }



}
