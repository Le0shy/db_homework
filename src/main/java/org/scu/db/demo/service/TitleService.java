package org.scu.db.demo.service;

import org.scu.db.demo.model.Title;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TitleService {
    List<Title> findIliadOrOdysseyTitle();
}
