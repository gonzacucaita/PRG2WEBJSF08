package com.edu.ubosque.prg.beans;

import com.edu.ubosque.prg.dao.AuditDAO;
import com.edu.ubosque.prg.dao.impl.AuditDAOImpl;
import com.edu.ubosque.prg.entity.Audit;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
@SessionScoped
public class AuditBean {

	private Audit auditoria;
	private DataModel listaAuditoria;

	public String adicionarAuditoria(Audit auditoria) {
		AuditDAO dao = new AuditDAOImpl();
		dao.save(auditoria);
		return "listAudit";
	}

	public DataModel getListarAuditoria() {
		List<Audit> lista = new AuditDAOImpl().list();
		listaAuditoria = new ListDataModel(lista);
		return listaAuditoria;
	}

}