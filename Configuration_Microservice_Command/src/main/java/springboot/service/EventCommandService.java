package springboot.service;

import springboot.Configuration.dto.PayloadDTO;
import springboot.model.*;

public interface EventCommandService {

	Event insert(PayloadDTO p);
    boolean delete(long id);
    boolean update(Event p);
    
}
