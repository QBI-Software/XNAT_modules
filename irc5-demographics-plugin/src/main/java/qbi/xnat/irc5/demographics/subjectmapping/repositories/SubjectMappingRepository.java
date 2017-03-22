package qbi.xnat.irc5.demographics.subjectmapping.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import qbi.xnat.irc5.demographics.subjectmapping.entities.SubjectMapping;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectMappingRepository extends AbstractHibernateDAO<SubjectMapping> {
}
