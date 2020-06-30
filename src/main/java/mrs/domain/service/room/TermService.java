package mrs.domain.service.room;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mrs.domain.model.ReservableRoom;
import mrs.domain.repository.room.MeetingRoomRepository;
import mrs.domain.repository.room.ReservableRoomRepository;
import mrs.domain.repository.room.TermsRepository;

@Service
@Transactional
public class TermService {
	
	@Autowired
	ReservableRoomRepository reservableRoomRepository;

	@Autowired
	MeetingRoomRepository meetingRoomRepository;

	@Autowired
	TermsRepository termsRepository;
	
	
	public List<ReservableRoom> findReservableRooms(LocalDate date) {
		return reservableRoomRepository.findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(date);
	}

	
	public int select() {
		return termsRepository.select(1);
	}
	
//	public MeetingRoom findMeetingRoom(Integer roomId) {
//		return meetingRoomRepository.findOne(roomId);
//	}
}