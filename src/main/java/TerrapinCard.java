public class TerrapinCard {

private double balance;

public TerrapinCard(double balanceAtStart)
{
  balance = balanceAtStart;
}

public String toString()
{
  return "The card has " + balance + " dollars";
}

public void payEconomical()
{
  if(balance < 2.5){
    this.balance = balance;
  }else{
    balance -= 2.5;
  }
}

public void payGourmet()
{
  if(balance < 4.0){
    this.balance = balance;
  }else{
  balance -= 4.0;
  }
}
}
