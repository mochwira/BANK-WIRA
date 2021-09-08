$(document).ready(function(){

    $('.nBtn, .table .eBtn').click(function(e){
        e.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();

        if(text == 'Edit') {
            $.getJSON(href, function(response){
                $('.myForm #nasabahId').val(response.nasabahId).hide();
                $('.myForm #namaLengkap').val(response.namaLengkap);
                $('.myForm #alamat').val(response.alamat);
                $('.myForm #tempatLahir').val(response.tempatLahir);
                $('.myForm #tanggalLahir').val(response.tanggalLahir);
                $('.myForm #noKtp').val(response.noKtp);
                $('.myForm #noHp').val(response.noHp);
            });
            $('.myForm #nasabahModal').modal();
        } else {
            $('.myForm #nasabahId').val('0').hide();
            $('.myForm #namaLengkap').val('');
            $('.myForm #alamat').val('');
            $('.myForm #tempatLahir').val('');
            $('.myForm #tanggalLahir').val('');
            $('.myForm #noKtp').val('');
            $('.myForm #noHp').val('');

            $('.myForm #nasabahModal').modal();
        }

    });

    $('.rBtn').click(function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $(".myRemoveNasabah .dBtn").attr('href',href);
        $('.myRemoveNasabah #nasabahModal').modal();

    });

});