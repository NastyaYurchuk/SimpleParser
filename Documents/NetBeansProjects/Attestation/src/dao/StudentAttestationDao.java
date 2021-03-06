
package dao;

import dao.entities.DateAttestation;
import dao.entities.Group;
import dao.entities.LecturerWorkload;
import dao.entities.StudentAttestation;
import dao.entities.Subject;
import java.util.List;

/**
 *
 * @author nastja
 */
public interface StudentAttestationDao {
    
   List<StudentAttestation> findByGroup(LecturerWorkload lw, DateAttestation da);
   
   List<StudentAttestation> findByGroup(Subject name, Group group, DateAttestation da);

    public void setListAttestation(List<StudentAttestation> attestations);

    public void updateAttestation(List<StudentAttestation> attestations);
    
    public void setAttestation(StudentAttestation attestation);
}
