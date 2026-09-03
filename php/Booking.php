<?php
header('Content-Type: application/json');
class Booking {
    private $file = "../bookings.json";
    public function createBooking($data) {
        $bookings = [];
        if (file_exists($this->file)) {
            $bookings = json_decode(file_get_contents($this->file), true);
        }
        $newBooking = [
            'id' => uniqid(),
            'name' => $data['name'],
            'email' => $data['email'],
            'guests' => $data['guests'],
            'tier' => $data['serviceTier'],
            'price' => $data['price'],
            'date' => $data['date'],
            'status' => 'Pending'
        ];
        $bookings[] = $newBooking;
        file_put_contents($this->file, json_encode($bookings, JSON_PRETTY_PRINT));
        return json_encode(['status' => 'success']);
    }
}
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $booking = new Booking();
    echo $booking->createBooking($_POST);
}
?>