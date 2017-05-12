package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import model.Local;
import service.LocalService;

@ManagedBean
@ViewScoped
public class LocalManagedBean {
	
	private Local local = new Local();
	private List<Local> locals;
	private LocalService service = new LocalService();

//	// Edição de um aluno na tabela
//	public void onRowEdit(RowEditEvent event) {
//
//		Aluno a = ((Aluno) event.getObject());
//		service.alterar(a);
//	}

	public void save() {
		local = service.save(local);
		
		if (locals != null)
			locals.add(local);
		
		local = new Local();
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public List<Local> getLocals() {
		if (locals == null)
			locals = service.getLocals();
		return locals;
	}

	public void delete(Local local) {
		service.remove(local);
		locals.remove(local);
	}
}
