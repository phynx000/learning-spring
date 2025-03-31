package vn.hoidanit.laptopshop.domain;

public class User {

    private long id;
    private String email;
    private String password;
    private String fullName;
    private String addrees;
    private String phone;

    public long id() {
        return id;
    }

    public String email() {
        return email;
    }

    public String password() {
        return password;
    }

    public String fullName() {
        return fullName;
    }

    public String addrees() {
        return addrees;
    }

    public String phone() {
        return phone;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", addrees='" + addrees + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
