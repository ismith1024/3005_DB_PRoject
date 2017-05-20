package Project;

/*
A Country has:
* A Country ID
* One rate for each EEE Category
* A reporting period
* An address or URL for billing purposes
* An annual reguistration fee (which may be zero)
*/


public class Country {
  String ID;
  float EHFRates[];
  boolean ReportsMonthly;
  boolean ReportsAnnually;
  boolean ReportsSemiAnnually;
  boolean ReportsQuarterly;
  String AuthorityName;
  String AuthorityContact;
  float AnnualFee;
  
  public Country(String I, float c1, float c2, float c3, float c4, float c5, float c6, float c7, float c8, float c9, float c10,
	boolean repA, boolean repS, boolean repQ, boolean repM, String ANam, String ACon, float fee){
	ID = I;
	EHFRates = new float[11];
	// NOTE: EHFRates[0] is not used -- I want the array index to correspond to the EEE category
	EHFRates[1] = c1;
	EHFRates[2] = c2;
	EHFRates[3] = c3;
	EHFRates[4] = c4;
	EHFRates[5] = c5;
	EHFRates[6] = c6;
	EHFRates[7] = c7;
	EHFRates[8] = c8;
	EHFRates[9] = c9;
	EHFRates[10] = c10;

	ReportsAnnually = false;
	ReportsSemiAnnually = false;
	ReportsQuarterly = false;
	ReportsMonthly = false;
	
	if(repA) ReportsAnnually = true;
	else if(repS) ReportsSemiAnnually = true;
	else if(repQ) ReportsQuarterly = true;
	else ReportsMonthly = true;
	
	AuthorityName = ANam;
	AuthorityContact = ACon;
	AnnualFee = fee;
  }
}
