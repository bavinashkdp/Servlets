package beans.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import beans.dto.UploadFile;

public class FilrUploadDaoImpl implements FileUploadDao
{
    @Autowired
    private SessionFactory sessionFactory;
     
    public FilrUploadDaoImpl() {
    }
 
    public FilrUploadDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    @Transactional
    public void save(UploadFile uploadFile) {
        sessionFactory.getCurrentSession().save(uploadFile);
    }

	

}
