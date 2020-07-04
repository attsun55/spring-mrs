package mrs.domain.repository;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao
public interface TermsRepository {

//	@Query("SELECT DISTINCT x FROM ReservableRoom x LEFT JOIN FETCH x.meetingRoom WHERE x.reservableRoomId.reservedDate = :date ORDER BY x.reservableRoomId.roomId ASC")
//	List<ReservableRoom> findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(@Param("date") LocalDate reservedDate);
//
//	@Lock(LockModeType.PESSIMISTIC_WRITE)
//	ReservableRoom findOneForUpdateByReservableRoomId(ReservableRoomId reservableRoomId);
	
	@Select
	int select(Integer id);
}