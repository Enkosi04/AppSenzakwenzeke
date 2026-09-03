function calculatePrice() {
    const guests = document.getElementById('guests').value;
    const tier = document.getElementById('serviceTier').value;
    let pricePerPerson = 0;
    if (tier === 'Basic') pricePerPerson = 150;
    if (tier === 'Standard') pricePerPerson = 250;
    if (tier === 'Premium') pricePerPerson = 350;
    const total = guests * pricePerPerson;
    document.getElementById('totalPrice').innerText = "Total Price: R" + total;
    document.getElementById('price').value = total;
}