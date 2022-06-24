import java.io.*;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class ReadJson {
	public static void downloadFile(URL url, String fileName) throws IOException {
        try (InputStream in = url.openStream();
                BufferedInputStream bis = new BufferedInputStream(in);
                FileOutputStream fos = new FileOutputStream(fileName)) {
 
            byte[] data = new byte[1024];
            int count;
            while ((count = bis.read(data, 0, 1024)) != -1) {
                fos.write(data, 0, count);
            }
        }
    }
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://raw.githubusercontent.com/globaldothealth/monkeypox/main/latest.json");
    	downloadFile(url,"C:\\D\\auto.json");
        // .json 파일 READ
        int England = 0; int Portugal = 0; int Spain = 0; int US = 0; int Canada = 0; int Sweden = 0;int Italy = 0; 
        int France = 0; int Belgium = 0; int Australia = 0; int Germany = 0;int Netherlands = 0; int Irael = 0; 
        int Switzerland =0; int Austria = 0; int Argentina = 0;int Denmark=0; int Morocco=0; int Slovenia=0;
        int CzechRepublic=0;int UnitedArabEmirates =0;int NorthernIreland=0; int Bolivia=0; int Iran=0;
        int Ecuador=0; int Malta=0; int Ireland=0; int Mexico=0; int Pakistan=0; int FrenchGuiana=0;int Thailand=0; 
        int Peru=0; int Brazil=0; int Malaysia=0; int Norway=0;int Paraguauy=0;int CostaRica=0;int Mauritius=0; int Finland=0; 
        int Haiti=0; int Uruguay=0; int Latvia=0;int CaymanIslcands=0; int Kosovo=0; int Turkey=0; int Bahamas=0;int Ghana=0;
        int Greece=0; int India=0;int Iceland=0;int Poland=0;int Uganda=0; int Bangladesh=0; int Cambodia=0; int Malawi=0;
        int Venezuela=0;int Gerogia=0;int Slovakia=0;int LuxemBourg=0; int Nepal=0;int Hungary=0;int Chile=0;int Serbia=0;
        int Lebanon=0;int SouthKorea=0;int Singapore=0;int Romania=0; int Israel=0;int Georgia=0;
        int SouthAfrica=0;
     
        Reader reader = new FileReader("C:\\D\\auto.json");
        // reader를 Object로 parse
        JSONParser parser = new JSONParser();
        Object obj = null;
		try {
			obj = parser.parse(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		JSONObject resultObj = new JSONObject();
		resultObj.put("code","100");
		resultObj.put("msg","success");
		JSONArray componentArray = new JSONArray();
		JSONObject EnglandObj = new JSONObject();
		JSONObject PortugalObj = new JSONObject();
		JSONObject SpainObj = new JSONObject();
		JSONObject USObj = new JSONObject();
		JSONObject CanadaObj = new JSONObject();
		JSONObject SwedenObj = new JSONObject();
		JSONObject ItalyObj = new JSONObject();
		JSONObject FranceObj = new JSONObject();
		JSONObject BelgiumObj = new JSONObject();
		JSONObject AustraliaObj = new JSONObject();
		JSONObject GermanyObj = new JSONObject();
		JSONObject NetherlandsObj = new JSONObject();
		JSONObject IsraelObj = new JSONObject();
		JSONObject SwitzerlandObj = new JSONObject();
		JSONObject AustriaObj = new JSONObject();
		JSONObject ArgentinaObj = new JSONObject();
		JSONObject DenmarkObj = new JSONObject();
		JSONObject MoroccoObj = new JSONObject();
		JSONObject SloveniaObj = new JSONObject();
		JSONObject CzechRepublicObj = new JSONObject();
		JSONObject UnitedArabEmiratesObj = new JSONObject();
		JSONObject BoliviaObj = new JSONObject();
		JSONObject IranObj = new JSONObject();
		JSONObject EcuadorObj = new JSONObject();
		JSONObject MaltaObj = new JSONObject();
		JSONObject IrelandObj = new JSONObject();
		JSONObject MexicoObj = new JSONObject();
		JSONObject PakistanObj = new JSONObject();
		JSONObject FrenchGuianaObj = new JSONObject();
		JSONObject ThailandObj = new JSONObject();
		JSONObject PeruObj = new JSONObject();
		JSONObject BrazilObj = new JSONObject();
		JSONObject MalaysiaObj = new JSONObject();
		JSONObject NorwayObj = new JSONObject();
		JSONObject ParaguauyObj = new JSONObject();
		JSONObject CostaRicaObj = new JSONObject();
		JSONObject FinlandObj = new JSONObject();
		JSONObject HaitiObj = new JSONObject();
		JSONObject UruguayObj = new JSONObject();
		JSONObject LatviaObj = new JSONObject();
		JSONObject KosovoObj = new JSONObject();
		JSONObject TurkeyObj = new JSONObject();
		JSONObject BahamasObj = new JSONObject();
		JSONObject GhanaObj = new JSONObject();
		JSONObject GreeceObj = new JSONObject();
		JSONObject IndiaObj = new JSONObject();
		JSONObject IcelandObj = new JSONObject();
		JSONObject PolandObj = new JSONObject();
		JSONObject UgandaObj = new JSONObject();
		JSONObject BangladeshObj = new JSONObject();
		JSONObject CambodiaObj = new JSONObject();
		JSONObject MalawiObj = new JSONObject();
		JSONObject VenezuelaObj = new JSONObject();
		JSONObject GeorgiaObj = new JSONObject();
		JSONObject SlovakiaObj = new JSONObject();
		JSONObject LuxemBourgObj = new JSONObject();
		JSONObject NepalObj = new JSONObject();
		JSONObject HungaryObj = new JSONObject();
		JSONObject ChileObj = new JSONObject();
		JSONObject SerbiaObj = new JSONObject();
		JSONObject LebanonObj = new JSONObject();
		JSONObject SouthKoreaObj = new JSONObject();
		JSONObject RomaniaObj = new JSONObject();
		JSONObject SouthAfricaObj = new JSONObject();
        JSONArray jsonArr = (JSONArray)obj;
        
        // jsonArr에서 하나씩 JSONObject로 cast해서 사용
        if (jsonArr.size() > 0){
        	for(int i=0; i<jsonArr.size(); i++){
        	JSONObject jsonObj = (JSONObject)jsonArr.get(i);
            //전체 출력 코드
            //System.out.println((String)jsonObj.get("Country"));
            String country = (String)jsonObj.get("Country");
            String dc = (String)jsonObj.get("Date_confirmation");
            	if(country.equals("England") || country.equals("Scotland") || country.equals("Wales") || country.equals("Cayman Island") || country.equals("Northern Ireland")) { 
            		England += 1;
            		EnglandObj.put("name","United Kingdom");
            		String Latest = dc;
            		EnglandObj.put("Last", Latest);
            	}
            	if(country.equals("Portugal")) { 
            		Portugal += 1;
            		PortugalObj.put("name",country);
            		String Latest = dc;
            		PortugalObj.put("Last", Latest);
            	}
            	if(country.equals("Spain")) { 
            		Spain += 1;
            		SpainObj.put("name",country);
            		String Latest = dc;
            		SpainObj.put("Last", Latest);
            	}
            	if(country.equals("United States")) { 
            		US += 1;
            		USObj.put("name",country);
            		String Latest = dc;
            		USObj.put("Last", Latest);
            	}
            	if(country.equals("Canada")) { 
            		Canada += 1;
            		CanadaObj.put("name",country);
            		String Latest = dc;
            		CanadaObj.put("Last", Latest);
            	}
            	if(country.equals("Sweden")) { 
            		Sweden += 1;
            		CanadaObj.put("name",country);
            		String Latest = dc;
            		CanadaObj.put("Last", Latest);
            	}
            	if(country.equals("Italy")) { 
            		Italy += 1;
            		ItalyObj.put("name",country);
            		String Latest = dc;
            		ItalyObj.put("Last", Latest);
            	}
            	if(country.equals("France")) { 
            		France += 1;
            		FranceObj.put("name",country);
            		String Latest = dc;
            		FranceObj.put("Last", Latest);
            	}
            	if(country.equals("Belgium")) { 
            		Belgium += 1;
            		BelgiumObj.put("name",country);
            		String Latest = dc;
            		BelgiumObj.put("Last", Latest);
            	}
            	if(country.equals("Australia")) { 
            		Australia += 1;
            		AustraliaObj.put("name",country);
            		String Latest = dc;
            		AustraliaObj.put("Last", Latest);
            	}
            	if(country.equals("Germany")) { 
            		Germany += 1;
            		GermanyObj.put("name",country);
            		String Latest = dc;
            		GermanyObj.put("Last", Latest);
            	}
            	if(country.equals("Netherlands")) { 
            		Netherlands += 1;
            		NetherlandsObj.put("name",country);
            		String Latest = dc;
            		NetherlandsObj.put("Last", Latest);
            	}
            	if(country.equals("Israel")) { 
            		Israel += 1;
            		IsraelObj.put("name",country);
            		String Latest = dc;
            		IsraelObj.put("Last", Latest);
            	}
            	if(country.equals("Switzerland")) { 
            		Switzerland += 1;
            		SwitzerlandObj.put("name",country);
            		String Latest = dc;
            		SwitzerlandObj.put("Last", Latest);
            	}
            	if(country.equals("Austria")) { 
            		Austria += 1;
            		AustriaObj.put("name",country);
            		String Latest = dc;
            		AustriaObj.put("Last", Latest);
            	}
            	if(country.equals("Argentina")) { 
            		Argentina += 1;
            		ArgentinaObj.put("name",country);
            		String Latest = dc;
            		ArgentinaObj.put("Last", Latest);
            	}
            	if(country.equals("Denmark")) { 
            		Denmark += 1;
            		DenmarkObj.put("name",country);
            		String Latest = dc;
            		DenmarkObj.put("Last", Latest);
            	}
            	if(country.equals("Morocco")) { 
            		Morocco += 1;
            		MoroccoObj.put("name",country);
            		String Latest = dc;
            		MoroccoObj.put("Last", Latest);
            	}
            	if(country.equals("Slovenia")) { 
            		Slovenia += 1;
            		SloveniaObj.put("name",country);
            		String Latest = dc;
            		SloveniaObj.put("Last", Latest);
            	}
            	if(country.equals("Czech Republic")) { 
            		CzechRepublic += 1;
            		CzechRepublicObj.put("name",country);
            		String Latest = dc;
            		CzechRepublicObj.put("Last", Latest);
            	}
            	if(country.equals("United Arab Emirates")) { 
            		UnitedArabEmirates += 1;
            		UnitedArabEmiratesObj.put("name",country);
            		String Latest = dc;
            		UnitedArabEmiratesObj.put("Last", Latest);
            	}
            	if(country.equals("Bolivia")) { 
            		Bolivia += 1;
            		BoliviaObj.put("name",country);
            		String Latest = dc;
            		BoliviaObj.put("Last", Latest);
            	}
            	if(country.equals("Iran")) { 
            		Iran += 1;
            		IranObj.put("name",country);
            		String Latest = dc;
            		IranObj.put("Last", Latest);
            	}
            	if(country.equals("Ecuador")) { 
            		Ecuador += 1;
            		EcuadorObj.put("name",country);
            		String Latest = dc;
            		EcuadorObj.put("Last", Latest);
            	}
            	if(country.equals("Malta")) { 
            		Malta += 1;
            		MaltaObj.put("name",country);
            		String Latest = dc;
            		MaltaObj.put("Last", Latest);
            	}
            	if(country.equals("Ireland")) { 
            		Ireland += 1;
            		IrelandObj.put("name",country);
            		String Latest = dc;
            		IrelandObj.put("Last", Latest);
            	}
            	if(country.equals("Mexico")) { 
            		Mexico += 1;
            		MexicoObj.put("name",country);
            		String Latest = dc;
            		MexicoObj.put("Last", Latest);
            	}
            	if(country.equals("Pakistan")) { 
            		Pakistan += 1;
            		PakistanObj.put("name",country);
            		String Latest = dc;
            		PakistanObj.put("Last", Latest);
            	}
            	if(country.equals("French Guiana")) { 
            		FrenchGuiana += 1;
            		FrenchGuianaObj.put("name",country);
            		String Latest = dc;
            		FrenchGuianaObj.put("Last", Latest);
            	}
            	if(country.equals("Thailand")) { 
            		Thailand += 1;
            		ThailandObj.put("name",country);
            		String Latest = dc;
            		ThailandObj.put("Last", Latest);
            	}
            	if(country.equals("Peru")) { 
            		Peru += 1;
            		PeruObj.put("name",country);
            		String Latest = dc;
            		PeruObj.put("Last", Latest);
            	}
            	if(country.equals("Brazil")) { 
            		Brazil += 1;
            		BrazilObj.put("name",country);
            		String Latest = dc;
            		BrazilObj.put("Last", Latest);
            	}
            	if(country.equals("Malaysia")) { 
            		Malaysia += 1;
            		MalaysiaObj.put("name",country);
            		String Latest = dc;
            		MalaysiaObj.put("Last", Latest);
            	}
            	if(country.equals("Norway")) { 
            		Norway += 1;
            		NorwayObj.put("name",country);
            		String Latest = dc;
            		NorwayObj.put("Last", Latest);
            	}
            	if(country.equals("Paraguay")) { 
            		Paraguauy += 1;
            		ParaguauyObj.put("name",country);
            		String Latest = dc;
            		ParaguauyObj.put("Last", Latest);
            	}
            	if(country.equals("Costa Rica")) { 
            		CostaRica += 1;
            		CostaRicaObj.put("name",country);
            		String Latest = dc;
            		CostaRicaObj.put("Last", Latest);
            	}
            	if(country.equals("Finland")) { 
            		Finland += 1;
            		FinlandObj.put("name",country);
            		String Latest = dc;
            		FinlandObj.put("Last", Latest);
            	}
            	if(country.equals("Haiti")) { 
            		Haiti += 1;
            		HaitiObj.put("name",country);
            		String Latest = dc;
            		HaitiObj.put("Last", Latest);
            	}
            	if(country.equals("Uruguay")) { 
            		Uruguay += 1;
            		UruguayObj.put("name",country);
            		String Latest = dc;
            		UruguayObj.put("Last", Latest);
            	}
            	if(country.equals("Latvia")) { 
            		Latvia += 1;
            		LatviaObj.put("name",country);
            		String Latest = dc;
            		LatviaObj.put("Last", Latest);
            	}
            	if(country.equals("Kosovo")) { 
            		Kosovo += 1;
            		KosovoObj.put("name",country);
            		String Latest = dc;
            		KosovoObj.put("Last", Latest);
            	}
            	if(country.equals("Turkey")) { 
            		Turkey += 1;
            		TurkeyObj.put("name",country);
            		String Latest = dc;
            		TurkeyObj.put("Last", Latest);
            	}
            	if(country.equals("Bahamas")) { 
            		Bahamas += 1;
            		BahamasObj.put("name",country);
            		String Latest = dc;
            		BahamasObj.put("Last", Latest);
            	}
            	if(country.equals("Ghana")) { 
            		Ghana += 1;
            		GhanaObj.put("name",country);
            		String Latest = dc;
            		GhanaObj.put("Last", Latest);
            	}
            	if(country.equals("Greece")) { 
            		Greece += 1;
            		GreeceObj.put("name",country);
            		String Latest = dc;
            		GreeceObj.put("Last", Latest);
            	}
            	if(country.equals("India")) { 
            		India += 1;
            		IndiaObj.put("name",country);
            		String Latest = dc;
            		IndiaObj.put("Last", Latest);
            	}
            	if(country.equals("Iceland")) { 
            		Iceland += 1;
            		IcelandObj.put("name",country);
            		String Latest = dc;
            		IcelandObj.put("Last", Latest);
            	}
            	if(country.equals("Poland")) { 
            		Poland += 1;
            		PolandObj.put("name",country);
            		String Latest = dc;
            		PolandObj.put("Last", Latest);
            	}
            	if(country.equals("Uganda")) { 
            		Uganda += 1;
            		UgandaObj.put("name",country);
            		String Latest = dc;
            		UgandaObj.put("Last", Latest);
            	}
            	if(country.equals("Bangladesh")) { 
            		Bangladesh += 1;
            		BangladeshObj.put("name",country);
            		String Latest = dc;
            		BangladeshObj.put("Last", Latest);
            	}
            	if(country.equals("Cambodia")) { 
            		Cambodia += 1;
            		CambodiaObj.put("name",country);
            		String Latest = dc;
            		CambodiaObj.put("Last", Latest);
            	}
            	if(country.equals("Malawi")) { 
            		Malawi += 1;
            		MalawiObj.put("name",country);
            		String Latest = dc;
            		MalawiObj.put("Last", Latest);
            	}
            	if(country.equals("Venezuela")) { 
            		Venezuela += 1;
            		VenezuelaObj.put("name",country);
            		String Latest = dc;
            		VenezuelaObj.put("Last", Latest);
            	}
            	if(country.equals("Georgia")) { 
            		Georgia += 1;
            		GeorgiaObj.put("name",country);
            		String Latest = dc;
            		GeorgiaObj.put("Last", Latest);
            	}
            	if(country.equals("Slovakia")) { 
            		Slovakia += 1;
            		SlovakiaObj.put("name",country);
            		String Latest = dc;
            		SlovakiaObj.put("Last", Latest);
            	}
            	if(country.equals("LuxemBourg")) { 
            		LuxemBourg += 1;
            		LuxemBourgObj.put("name",country);
            		String Latest = dc;
            		LuxemBourgObj.put("Last", Latest);
            	}
            	if(country.equals("Nepal")) { 
            		Nepal += 1;
            		NepalObj.put("name",country);
            		String Latest = dc;
            		NepalObj.put("Last", Latest);
            	}
            	if(country.equals("Hungary")) { 
            		Hungary += 1;
            		HungaryObj.put("name",country);
            		String Latest = dc;
            		HungaryObj.put("Last", Latest);
            	}
            	if(country.equals("Chile")) { 
            		Chile += 1;
            		ChileObj.put("name",country);
            		String Latest = dc;
            		ChileObj.put("Last", Latest);
            	}
            	if(country.equals("Serbia")) { 
            		Serbia += 1;
            		SerbiaObj.put("name",country);
            		String Latest = dc;
            		SerbiaObj.put("Last", Latest);
            	}
            	if(country.equals("Lebanon")) { 
            		Lebanon += 1;
            		LebanonObj.put("name",country);
            		String Latest = dc;
            		LebanonObj.put("Last", Latest);
            	}
            	if(country.equals("South Korea")) { 
            		SouthKorea += 1;
            		SouthKoreaObj.put("name",country);
            		String Latest = dc;
            		SouthKoreaObj.put("Last", Latest);
            	}
            	if(country.equals("Romania")) { 
            		Romania += 1;
            		RomaniaObj.put("name",country);
            		String Latest = dc;
            		RomaniaObj.put("Last", Latest);
            	}
            	if(country.equals("South Africa")) { 
            		SouthAfrica += 1;
            		SouthAfricaObj.put("name",country);
            		String Latest = dc;
            		SouthAfricaObj.put("Last", Latest);
            	}
        	}
            EnglandObj.put("id","gb");
            EnglandObj.put("accure",England);
            componentArray.add(EnglandObj);
            PortugalObj.put("id","pt");
            PortugalObj.put("accure",Portugal);
            componentArray.add(PortugalObj);
            SpainObj.put("id","es");
            SpainObj.put("accure",Spain);
            componentArray.add(SpainObj);
            USObj.put("id","us");
            USObj.put("accure",US);
            componentArray.add(USObj);
            CanadaObj.put("id","ca");
            CanadaObj.put("accure",Canada);
            componentArray.add(CanadaObj);
            SwedenObj.put("id","se");
            SwedenObj.put("accure",Sweden);
            componentArray.add(SwedenObj);
            ItalyObj.put("id","it");
            ItalyObj.put("accure",Italy);
            componentArray.add(ItalyObj);
            FranceObj.put("id","fr");
            FranceObj.put("accure",France);
            componentArray.add(FranceObj);
            BelgiumObj.put("id","be");
            BelgiumObj.put("accure",Belgium);
            componentArray.add(BelgiumObj);
            AustraliaObj.put("id","au");
            AustraliaObj.put("accure",Australia);
            componentArray.add(AustraliaObj);
            GermanyObj.put("id","de");
            GermanyObj.put("accure",Germany);
            componentArray.add(GermanyObj);
            NetherlandsObj.put("id","nl");
            NetherlandsObj.put("accure",Netherlands);
            componentArray.add(NetherlandsObj);
            IsraelObj.put("id","il");
            IsraelObj.put("accure",Israel);
            componentArray.add(IsraelObj);
            SwitzerlandObj.put("id","ch");
            SwitzerlandObj.put("accure",Switzerland);
            componentArray.add(SwitzerlandObj);
            AustriaObj.put("id","at");
            AustriaObj.put("accure",Austria);
            componentArray.add(AustriaObj);
            ArgentinaObj.put("id","ar");
            ArgentinaObj.put("accure",Argentina);
            componentArray.add(ArgentinaObj);
            DenmarkObj.put("id","dk");
            DenmarkObj.put("accure",Denmark);
            componentArray.add(DenmarkObj);
            MoroccoObj.put("id","ma");
            MoroccoObj.put("accure",Morocco);
            componentArray.add(MoroccoObj);
            SloveniaObj.put("id","si");
            SloveniaObj.put("accure",Slovenia);
            componentArray.add(SloveniaObj);
            CzechRepublicObj.put("id","cz");
            CzechRepublicObj.put("accure",CzechRepublic);
            componentArray.add(CzechRepublicObj);
            UnitedArabEmiratesObj.put("id","ae");
            UnitedArabEmiratesObj.put("accure",UnitedArabEmirates);
            componentArray.add(UnitedArabEmiratesObj);
            BoliviaObj.put("id","bo");
            BoliviaObj.put("accure",Bolivia);
            componentArray.add(BoliviaObj);
            IranObj.put("id","ir");
            IranObj.put("accure",Iran);
            componentArray.add(IranObj);
            EcuadorObj.put("id","ec");
            EcuadorObj.put("accure",Ecuador);
            componentArray.add(EnglandObj);
            MaltaObj.put("id","mt");
            MaltaObj.put("accure",Malta);
            componentArray.add(MaltaObj);
            IrelandObj.put("id","ie");
            IrelandObj.put("accure",Ireland);
            componentArray.add(IrelandObj);
            MexicoObj.put("id","mx");
            MexicoObj.put("accure",Mexico);
            componentArray.add(MexicoObj);
            PakistanObj.put("id","pk");
            PakistanObj.put("accure",Pakistan);
            componentArray.add(PakistanObj);
            FrenchGuianaObj.put("id","gf");
            FrenchGuianaObj.put("accure",FrenchGuiana);
            componentArray.add(FrenchGuianaObj);
            ThailandObj.put("id","th");
            ThailandObj.put("accure",Thailand);
            componentArray.add(ThailandObj);
            PeruObj.put("id","pe");
            PeruObj.put("accure",Peru);
            componentArray.add(PeruObj);
            BrazilObj.put("id","br");
            BrazilObj.put("accure",Brazil);
            componentArray.add(BrazilObj);
            MalaysiaObj.put("id","my");
            MalaysiaObj.put("accure",Malaysia);
            componentArray.add(MalaysiaObj);
            NorwayObj.put("id","no");
            NorwayObj.put("accure",Norway);
            componentArray.add(NorwayObj);
            ParaguauyObj.put("id","py");
            ParaguauyObj.put("accure",Paraguauy);
            componentArray.add(ParaguauyObj);
            CostaRicaObj.put("id","cr");
            CostaRicaObj.put("accure",CostaRica);
            componentArray.add(CostaRicaObj);
            FinlandObj.put("id","fi");
            FinlandObj.put("accure",Finland);
            componentArray.add(FinlandObj);
            HaitiObj.put("id","ht");
            HaitiObj.put("accure",Haiti);
            componentArray.add(HaitiObj);
            UruguayObj.put("id","uy");
            UruguayObj.put("accure",Uruguay);
            componentArray.add(UruguayObj);
            LatviaObj.put("id","lv");
            LatviaObj.put("accure",Latvia);
            componentArray.add(LatviaObj);
            KosovoObj.put("id","xk");
            KosovoObj.put("accure",Kosovo);
            componentArray.add(KosovoObj);
            TurkeyObj.put("id","tr");
            TurkeyObj.put("accure",Turkey);
            componentArray.add(TurkeyObj);
            BahamasObj.put("id","bs");
            BahamasObj.put("accure",Bahamas);
            componentArray.add(BahamasObj);
            GhanaObj.put("id","gh");
            GhanaObj.put("accure",Ghana);
            componentArray.add(GhanaObj);
            GreeceObj.put("id","gr");
            GreeceObj.put("accure",Greece);
            componentArray.add(GreeceObj);
            GreeceObj.put("id","gr");
            GreeceObj.put("accure",Greece);
            componentArray.add(GreeceObj);
            IndiaObj.put("id","in");
            IndiaObj.put("accure",India);
            componentArray.add(IndiaObj);
            IcelandObj.put("id","is");
            IcelandObj.put("accure",Iceland);
            componentArray.add(IcelandObj);
            PolandObj.put("id","pl");
            PolandObj.put("accure",Poland);
            componentArray.add(PolandObj);
            UgandaObj.put("id","ug");
            UgandaObj.put("accure",Uganda);
            componentArray.add(UgandaObj);
            BangladeshObj.put("id","bd");
            BangladeshObj.put("accure",Bangladesh);
            componentArray.add(BangladeshObj);
            CambodiaObj.put("id","kh");
            CambodiaObj.put("accure",Cambodia);
            componentArray.add(CambodiaObj);
            MalawiObj.put("id","mw");
            MalawiObj.put("accure",Malawi);
            componentArray.add(MalawiObj);
            VenezuelaObj.put("id","ve");
            VenezuelaObj.put("accure",Venezuela);
            componentArray.add(VenezuelaObj);
            GeorgiaObj.put("id","ge");
            GeorgiaObj.put("accure",Georgia);
            componentArray.add(GeorgiaObj);
            SlovakiaObj.put("id","sk");
            SlovakiaObj.put("accure",Slovakia);
            componentArray.add(SlovakiaObj);
            LuxemBourgObj.put("id","lu");
            LuxemBourgObj.put("accure",LuxemBourg);
            componentArray.add(SlovakiaObj);
            NepalObj.put("id","np");
            NepalObj.put("accure",Nepal);
            componentArray.add(NepalObj);
            HungaryObj.put("id","hu");
            HungaryObj.put("accure",Hungary);
            componentArray.add(HungaryObj);
            ChileObj.put("id","cl");
            ChileObj.put("accure",Chile);
            componentArray.add(ChileObj);
            SerbiaObj.put("id","rs");
            SerbiaObj.put("accure",Serbia);
            componentArray.add(SerbiaObj);
            LebanonObj.put("id","lb");
            LebanonObj.put("accure",Lebanon);
            componentArray.add(LebanonObj);
            SouthKoreaObj.put("id","kr");
            SouthKoreaObj.put("accure",SouthKorea);
            componentArray.add(SouthKoreaObj);
            RomaniaObj.put("id","ro");
            RomaniaObj.put("accure",Romania);
            componentArray.add(RomaniaObj);
            SouthAfricaObj.put("id","za");
            SouthAfricaObj.put("accure",SouthAfrica);
            componentArray.add(SouthAfricaObj);
        }
        String jsonStr = componentArray.toString();
        File jsonFile = new File("C:\\D/example.json");

        writeStringToFile(jsonStr, jsonFile);
	}
	 public static void writeStringToFile(String str, File file) throws IOException {
	        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	        writer.write(str);
	        writer.close();
	 }
}