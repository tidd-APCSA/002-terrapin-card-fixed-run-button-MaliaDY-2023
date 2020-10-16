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
      balance = balance;
    }else{
      balance -= 2.5;
    }
}

public void payGourmet()
{
  if(balance < 4.0){
    balance = balance;
  }else{
    balance -= 4.0;
  }
}

public void loadMoney(double amount)
{
  balance += amount;
  if(balance >= 150)
  {
    balance = 150;
  }
}
}