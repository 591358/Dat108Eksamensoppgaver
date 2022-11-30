package no.hvl.dat108.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.ApplicationScope;



public class Quiz {
		 private String id; //Unik id
		 private String tittel; //Hva quizen handler om
		 private Map<String, Integer> svarAlternativer = new HashMap<>();

		 // Nødvendige konstruktører, equals, settere og
		 // gettere kan antas at finnes
		 /**
		 * Øker antall stemmer for svaralternativ med navn lik
		 * parameteren alternativ
		 */
		 public void giStemmeTil(String alternativ) { 
			 if(svarAlternativer.containsKey(alternativ)) {
				 svarAlternativer.put(alternativ, svarAlternativer.get(alternativ)+1);
			 }
		 }
		 
		public Quiz(String tittel) {
			this.tittel = tittel;
			
			svarAlternativer.put("A", 0);
			svarAlternativer.put("B", 0);
			svarAlternativer.put("C", 0);
			svarAlternativer.put("D", 0);
			id = "0";
		}

		@Override
		public String toString() {
			return "Quiz [id=" + id + ", tittel=" + tittel + ", svarAlternativer=" + svarAlternativer + "]";
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTittel() {
			return tittel;
		}

		public void setTittel(String tittel) {
			this.tittel = tittel;
		}

		public Map<String, Integer> getSvarAlternativer() {
			return svarAlternativer;
		}

		public void setSvarAlternativer(Map<String, Integer> svarAlternativer) {
			this.svarAlternativer = svarAlternativer;
		}
		}

