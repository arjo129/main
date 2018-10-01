package seedu.divelog.logic.commands;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static seedu.divelog.logic.commands.CommandTestUtil.DESC_AMY;
import static seedu.divelog.logic.commands.CommandTestUtil.DESC_BOB;
import static seedu.divelog.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.divelog.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.divelog.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.divelog.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.divelog.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import org.junit.Test;

import seedu.divelog.logic.commands.EditCommand.EditDiveDescriptor;
import seedu.divelog.testutil.EditPersonDescriptorBuilder;

public class EditDiveDescriptorTest {

    @Test
    public void equals() {
        // same values -> returns true
        EditDiveDescriptor descriptorWithSameValues = new EditDiveDescriptor(DESC_AMY);
        assertTrue(DESC_AMY.equals(descriptorWithSameValues));

        // same object -> returns true
        assertTrue(DESC_AMY.equals(DESC_AMY));

        // null -> returns false
        assertFalse(DESC_AMY.equals(null));

        // different types -> returns false
        assertFalse(DESC_AMY.equals(5));

        // different values -> returns false
        assertFalse(DESC_AMY.equals(DESC_BOB));

        // different name -> returns false
        EditDiveDescriptor editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withName(VALID_NAME_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different phone -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withPhone(VALID_PHONE_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different email -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withEmail(VALID_EMAIL_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different divelog -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withAddress(VALID_ADDRESS_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different tags -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withTags(VALID_TAG_HUSBAND).build();
        assertFalse(DESC_AMY.equals(editedAmy));
    }
}