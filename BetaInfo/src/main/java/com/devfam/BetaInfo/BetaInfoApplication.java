package com.devfam.BetaInfo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.devfam.BetaInfo.dao.InformationRepository;
import com.devfam.BetaInfo.entites.Entreprise;
import com.devfam.BetaInfo.entites.Information;


@SpringBootApplication
public class BetaInfoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(BetaInfoApplication.class, args);
		InformationRepository infodao = ctx.getBean(InformationRepository.class);
		Information inf = ctx.getBean(Information.class);
		Entreprise ent = ctx .getBean(Entreprise.class);
		 ent = new Entreprise("bowsentreprise","dev", "kaedi");
		
		inf = new Information("01-11-2010", "publication", ent , "01-11-2016" ); 
		
	//	Information m = new Information("01-11-2020", "publication", e , "01-11-2016" );
		infodao.save(inf);
		infodao.save(new Information("01-11-2010", "publication", ent , "01-11-2016" ));
		infodao.save(new Information("01-21-2015", "publication", ent , "01-11-2016" ));
		infodao.save(new Information("01-11-2017", "publication", ent , "01-11-2014" ));
		
		infodao.delete(inf);
		List<Information> informations = infodao.findAll();
		for(Information infor : informations ) {
			System.out.println("date de publication" + infor.getDate_publication() +
					"l'offre de l'entreprise"+infor.getEntreprise().getNom());
		}
		
		
		
	}

}
