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
    balance -= 2.5;
}

public void payGourmet()
{
  balance -= 4.0;
}
}
