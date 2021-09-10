package LLd_LBM;

import LLd_2.Person;

public abstract class Account {
  String Id;
  String Password;
  AccountSataus status;
  
  Person person;
  
  
  public abstract boolean restPassword();
}
