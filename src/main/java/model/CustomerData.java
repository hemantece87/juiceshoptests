package model;

public class CustomerData {

   private final String emailId;
   private final String password;
   private final String repeatPassword;
   private final String secretAnswer;

    public CustomerData(CustomerFormBuilder customerFormBuilder) {
        this.emailId = customerFormBuilder.emailId;
        this.password = customerFormBuilder.password;
        this.repeatPassword = customerFormBuilder.repeatPassword;
        this.secretAnswer = customerFormBuilder.secretAnswer;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }


    public static class CustomerFormBuilder {
        private String emailId;
        private String password;
        private String repeatPassword;
        private String secretAnswer;

        public CustomerFormBuilder(String emailId, String password, String repeatPassword) {
            this.emailId = emailId;
            this.password = password;
            this.repeatPassword = repeatPassword;
        }

        public CustomerFormBuilder secretAnswer(String secretAnswer) {
            this.secretAnswer = secretAnswer;
            return this;
        }

        public CustomerData build() {
            return new CustomerData(this);
        }
    }
}
