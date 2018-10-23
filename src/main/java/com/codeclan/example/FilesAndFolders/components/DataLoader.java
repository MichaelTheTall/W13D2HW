package com.codeclan.example.FilesAndFolders.components;

import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import com.codeclan.example.FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User bob = new User("b0b");
        userRepository.save(bob);

        User jenny = new User("j3nny");
        userRepository.save(jenny);
        User meredith = new User("ub3rl33th4x0r_420n0sc0p3");
        userRepository.save(meredith);

        Folder bob_fold_1 = new Folder("Bob's Bookmarks", bob);
        folderRepository.save(bob_fold_1);
        Folder bob_fold_2 = new Folder("Bob's Documents", bob);
        folderRepository.save(bob_fold_2);
        Folder jenny_fold_1 = new Folder("Jenny's Documents", jenny);
        folderRepository.save(jenny_fold_1);
        Folder jenny_fold_2 = new Folder("Jenny's Secret Superhero Stuff", jenny);
        folderRepository.save(jenny_fold_2);
        Folder meredith_fold_1 = new Folder("Jenny's Secret Superhero Stuff (copy)", meredith);
        folderRepository.save(meredith_fold_1);
        Folder meredith_fold_2 = new Folder("Not Porn", meredith);
        folderRepository.save(meredith_fold_2);


        File bob_file_1 = new File("bbc.co.uk", "html", 2, bob_fold_1);
        fileRepository.save(bob_file_1);
        File bob_file_2 = new File("metro.co.uk", "html", 2, bob_fold_1);
        fileRepository.save(bob_file_2);
        File bob_file_3 = new File("guardian.co.uk", "html", 2, bob_fold_1);
        fileRepository.save(bob_file_3);
        File bob_file_4 = new File("My Thesis", "doc", 900, bob_fold_2);
        fileRepository.save(bob_file_4);


        File jenny_file_1 = new File("Credit Card Statement", "pdf", 50, jenny_fold_1);
        fileRepository.save(jenny_file_1);
        File jenny_file_2 = new File("Security Cam footage of The Shadow", "mp4", 5000, jenny_fold_2);
        fileRepository.save(jenny_file_2);
        File jenny_file_3 = new File("International Superhero Association Membership Invitation", "pdf", 200, jenny_fold_2);
        fileRepository.save(jenny_file_3);


        File meredith_file_1 = new File("Security Cam footage of The Shadow", "mp4", 5000, meredith_fold_1);
        fileRepository.save(meredith_file_1);
        File meredith_file_2 = new File("International Superhero Association Membership Invitation", "pdf", 200, meredith_fold_1);
        fileRepository.save(meredith_file_2);
        File meredith_file_3 = new File("Definitely Not Porn", "avi", 20000, meredith_fold_2);
        fileRepository.save(meredith_file_3);

    }


}
