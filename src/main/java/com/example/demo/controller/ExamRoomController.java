@RestController
@RequestMapping("/rooms")
public class ExamRoomController {

    private final ExamRoomService service;

    public ExamRoomController(ExamRoomService service) {
        this.service = service;
    }

    @PostMapping
    public ExamRoom addRoom(@RequestBody ExamRoom room) {
        return service.addRoom(room);
    }

    @GetMapping
    public List<ExamRoom> getAll() {
        return service.getAllRooms();
    }
}
