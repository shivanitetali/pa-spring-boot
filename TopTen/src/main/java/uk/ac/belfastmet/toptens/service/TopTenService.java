package uk.ac.belfastmet.toptens.service;
import java.util.ArrayList;

import uk.ac.belfastmet.toptens.domain.TopTen;

public class TopTenService
{

		private ArrayList<TopTen> internationalTopTens;
		private ArrayList<TopTen> indianTopTens;
		
		public ArrayList<TopTen> getInternationalTopTens()
		{
			this.internationalTopTens =  new ArrayList<TopTen>();
			
			this.internationalTopTens.add(new TopTen("Hollywood's Bleeding","Post Malone","International", "int1.png"));
			this.internationalTopTens.add(new TopTen("No.6 Collaborations Project","Ed Sheeran","International", "int2.png"));
			this.internationalTopTens.add(new TopTen("AitcH2O","Aitch","International", "int3.png"));
			this.internationalTopTens.add(new TopTen("Lover","Taylor Swift","International", "int4.png"));
			this.internationalTopTens.add(new TopTen("Divinely Uninspired To A Hellish Extent","Lewis Capaldi","International", "int5.png"));
			this.internationalTopTens.add(new TopTen("Backbone"," Status Quo","International", "int6.png"));
			this.internationalTopTens.add(new TopTen("Norman F**king Rockwell","Lana Del Ray","International", "int7.png"));
			this.internationalTopTens.add(new TopTen("K-12","Melanie Martinez","International", "int8.png"));
			this.internationalTopTens.add(new TopTen("Snacks","Jax Jones","International", "int9.png"));
			this.internationalTopTens.add(new TopTen("When We All Fall Asleep, Where Do We Go?","Billie Eilish","International", "int10.png"));
			
			return this.internationalTopTens;
		}
		
		public ArrayList<TopTen> getIndianTopTens()
		{
			this.indianTopTens =  new ArrayList<TopTen>();
			
			this.indianTopTens.add(new TopTen("Psycho Saiyaan","Sahoo","Indian", "ind1.png"));
			this.indianTopTens.add(new TopTen("The Wakhra Song","Judgemental","Indian", "ind2.png"));
			this.indianTopTens.add(new TopTen("Koka","Khandaani Shafakhana","Indian", "ind3.png"));
			this.indianTopTens.add(new TopTen("Photo","Luka Chuppi","Indian", "ind4.png"));
			this.indianTopTens.add(new TopTen("Chashni","Bharat","Indian", "ind5.png"));
			this.indianTopTens.add(new TopTen("Hauli Hauli","De De Pyaar De","Indian", "ind6.png"));
			this.indianTopTens.add(new TopTen("Kya Baat Ay","Harrdy Sandhu","Indian", "ind7.png"));
			this.indianTopTens.add(new TopTen("She Move It Like","ONE","Indian", "ind8.png"));
			this.indianTopTens.add(new TopTen("Chogada","Loveyatri","Indian", "ind9.png"));
			this.indianTopTens.add(new TopTen("Kamariya","Aastha Gill","Indian", "ind10.png"));
			
			return this.indianTopTens;
		}
}
