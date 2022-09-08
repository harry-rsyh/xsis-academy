package id.bootcamp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.model.M_EducationalLevel;
import id.bootcamp.repository.M_EducationalLevelRepository;

@Service
@Transactional
public class M_EducationalLevelService {
	
	@Autowired
	private M_EducationalLevelRepository rep;
	
	// Tampilkan Semua Level Edukasi Termasuk yang Telah dihapus
	public List<M_EducationalLevel> getAllLevel(){
		return rep.findAll();
	}
	
	// Tampilkan Semua Level yang belum di hapus
	public List<M_EducationalLevel> getAllNotDeleted() {
		return rep.findByIsDeleteFalse();
	}
	
	// Tampilkan Semua Level yang sudah di hapus
	public List<M_EducationalLevel> getAllDeleted() {
		return rep.findByIsDeleteTrue();
	}
	
	// Temukan Nama Duplikat
	public Boolean duplicateName(String name) {
		if(rep.findDuplicateName(name).size() > 0) {
			return true;
		}
		return false;
	}
	
	// Tampilkan Berdasarkan ID
	public M_EducationalLevel getById(Long id) {
		// Handling Jika tidak ada user dengan ID Tersebut
		if(rep.findById(id).orElse(null) == null) {
			return null;
		}
		return rep.findById(id).get();
	}
	
	public List<M_EducationalLevel> getByName(String name){
		return rep.findByName(name);
	}
	
	// Tampilkan Berdasarkan nama ignore case
	public List<M_EducationalLevel> getByNameIgnoreCase(String name){
		return rep.findByNameIgnoreCase(name);
	}
	
	// Tampilkan Berdasarkan Keyword
	public List<M_EducationalLevel> getByKeyword(String keyword){
		return rep.findByNameContainingIgnoreCase(keyword);
	}
	
	// Simpan / Update
	public void saveLevel(M_EducationalLevel mEdl) {
		rep.save(mEdl);
	}
}
