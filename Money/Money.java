
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros+addition.euros,this.cents+addition.cents); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }
    
    public Money minus(Money decreaser){      
        if (this.euros() - decreaser.euros()< 0){
            Money newMoney = new Money(0,0); // create a new Money object that has the correct worth    
            return newMoney;
        }else if (this.cents() - decreaser.cents() < 0 ){
            if (this.euros() - decreaser.euros() - 1 < 0){
                Money newMoney = new Money(0,0); // create a new Money object that has the correct worth    
                return newMoney;
            }else{
                Money newMoney = new Money(this.euros-decreaser.euros-1,this.cents-decreaser.cents+100); // create a new Money object that has the correct worth     
                return newMoney;
            }
        }
        
        Money newMoney = new Money(this.euros-decreaser.euros,this.cents-decreaser.cents); // create a new Money object that has the correct worth     
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if (this.euros() < compared.euros()){
            return true;
        } else if (this.euros() == compared.euros()){
            if (this.cents() < compared.cents()){
                return true;
            }            
        }
        
        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
