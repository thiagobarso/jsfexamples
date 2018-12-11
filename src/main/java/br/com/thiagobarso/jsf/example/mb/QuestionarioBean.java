package br.com.thiagobarso.jsf.example.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;

import br.com.thiagobarso.jsf.example.pojo.Resposta;

@ManagedBean
@SessionScoped
public class QuestionarioBean {
	
	private List<Resposta> respostas;
	
	private boolean mostraA1;
	
	@PostConstruct
	public void init() {
		
		mostraA1 = false;
		Resposta r1 = new Resposta(1l, "Sim", "S");
		Resposta r2 = new Resposta(2l, "Não", "N");
		
		respostas = new ArrayList<>();
		
		respostas.add(r1);
		respostas.add(r2);
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
	
	public void listener(ValueChangeEvent event) {
		String novoValor = (String) event.getNewValue();
		
		if(novoValor.equals("1")) {
			mostraA1 = true;
		}else {
			mostraA1 = false;
		}
		System.out.println("teste");
	}
	
	public void listenerAjax(AjaxBehaviorEvent event) {
		
		System.out.println("teste");
	}

	public boolean isMostraA1() {
		return mostraA1;
	}

	public void setMostraA1(boolean mostraA1) {
		this.mostraA1 = mostraA1;
	}
	
	
	
	

}
