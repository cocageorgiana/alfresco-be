package com.alfresco.acsbe.controller;

import com.alfresco.acsbe.dto.Entries;
import com.alfresco.acsbe.dto.Entry;
import com.alfresco.acsbe.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

import static com.alfresco.acsbe.utils.BuildJsonResponse.*;

@RestController()
@RequestMapping("/alfresco")
public class AlfrescoController {
  /**
   *
   * @return all entries about users
   */
  @GetMapping("/users")
  @CrossOrigin
  public @ResponseBody Entries buildUserJson() {
    User user1 = createUserOne();
    User user2 = createUserTwo();
    User user3 = createUserThree();
    User user4 = createUserFour();

    Entry entry1 = new Entry();
    entry1.setEntry(user1);
    Entry entry2 = new Entry();
    entry2.setEntry(user2);
    Entry entry3 = new Entry();
    entry3.setEntry(user3);
    Entry entry4 = new Entry();
    entry4.setEntry(user4);
    Entries entries = new Entries();
    entries.setEntries(Arrays.asList(entry1, entry2, entry3, entry4));

    return entries;
  }
}
