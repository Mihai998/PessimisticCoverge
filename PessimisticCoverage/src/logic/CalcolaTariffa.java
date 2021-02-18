//ipotizzo un caso in cui si vuole calcolare la tariffa per il soggiorno in un dato hotel, servono quindi il numero di giorni e la tariffa base per girno ovviamente non mi 
//aspetto un numero di gionri negativi, per cui ho il pessimistic coverage inserendo nel caso del test un valore appunto negativo che genererà una failure nonostante il 100% di coverage
package logic;

public class CalcolaTariffa 
{
	public int tariffaBase;
	public int nNotti;
	public CalcolaTariffa()
	{
	}
	public void setTariffa(int tariffaBase)
	{
		this.tariffaBase=tariffaBase;
	}
	public void setNotti(int n) {
		this.nNotti=n;
	}
	public int calcola()
	{
		return tariffaBase*nNotti;
	}
}
